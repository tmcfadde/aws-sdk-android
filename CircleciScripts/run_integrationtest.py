from utils import *
import sys
import os

test_results = sys.argv[1]
root = sys.argv[2]
credentials = sys.argv[3]

testmodules =  ["aws-android-sdk-apigateway-test",
                "aws-android-sdk-autoscaling-test",
                "aws-android-sdk-cloudwatch-test",
                "aws-android-sdk-elb-test",
                "aws-android-sdk-ddb-test",
                "aws-android-sdk-ddb-mapper-test",
                "aws-android-sdk-comprehend-test",
                "aws-android-sdk-iot-test",
                "aws-android-sdk-kinesis-test",
                "aws-android-sdk-kinesisvideo-archivedmedia",
                "aws-android-sdk-kinesisvideo",
                "aws-android-sdk-mobile-client",
                "aws-android-sdk-rekognition-test",
                "aws-android-sdk-polly-test",
                "aws-android-sdk-s3-test",
                "aws-android-sdk-sdb-test",
                "aws-android-sdk-sqs-test",
                "aws-android-sdk-sns-test",
                "aws-android-sdk-ses-test",
                "aws-android-sdk-transcribe-test",
                "aws-android-sdk-translate-test",
               ]

runcommand('echo "export testresult=0" >> $BASH_ENV')  
runcommand("rm -rf {0}".format(test_results))
runcommand("mkdir {0}".format(test_results))
for module in testmodules:                      
    credentialfolder = os.path.join(root, module,"src/androidTest/res/raw")
    runcommand("mkdir -p '{0}'".format(credentialfolder))
    credentialfile=os.path.join(credentialfolder,"awsconfiguration.json")
    runcommand('cp "{0}" "{1}"'.format(credentials, credentialfile))
    if runtest(module, TestTypes.IntegrationTest, test_results) != 0:
        exit(1)
