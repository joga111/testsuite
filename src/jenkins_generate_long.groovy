folder('GCS-CI-CD/TestsLong') {
   displayName('TestsLong')
   description('Tests in level long of GCS-CI-CD environemnt')
}
job('GCS-CI-CD/TestsLong/qrsh') {
   lockableResources {
      label('gcs-ci-cd-cluster')
      resourcesVariable('CLUSTER')
      resourceNumber(1)
   }
   wrappers {
      sshAgent('tstusr-rsa-key')
   }
   steps {
      shell('ssh tstusr@h007 /tools/CS/bin/gcs-ci-cd ${CLUSTER} check /home/tstusr/CS/gcs-ci-cd-0/testsuite/src/checktree/system_tests/clients/qrsh 200')
   }
}
queue('GCS-CI-CD/TestsLong/qrsh')
job('GCS-CI-CD/TestsLong/throughput') {
   lockableResources {
      label('gcs-ci-cd-cluster')
      resourcesVariable('CLUSTER')
      resourceNumber(1)
   }
   wrappers {
      sshAgent('tstusr-rsa-key')
   }
   steps {
      shell('ssh tstusr@h007 /tools/CS/bin/gcs-ci-cd ${CLUSTER} check /home/tstusr/CS/gcs-ci-cd-0/testsuite/src/checktree/performance/throughput 200')
   }
}
queue('GCS-CI-CD/TestsLong/throughput')
job('GCS-CI-CD/TestsLong/module_test_generic') {
   lockableResources {
      label('gcs-ci-cd-cluster')
      resourcesVariable('CLUSTER')
      resourceNumber(1)
   }
   wrappers {
      sshAgent('tstusr-rsa-key')
   }
   steps {
      shell('ssh tstusr@h007 /tools/CS/bin/gcs-ci-cd ${CLUSTER} check /home/tstusr/CS/gcs-ci-cd-0/testsuite/src/checktree/module_tests/module_test_generic 200')
   }
}
queue('GCS-CI-CD/TestsLong/module_test_generic')
job('GCS-CI-CD/TestsLong/current_version_upgrade') {
   lockableResources {
      label('gcs-ci-cd-cluster')
      resourcesVariable('CLUSTER')
      resourceNumber(1)
   }
   wrappers {
      sshAgent('tstusr-rsa-key')
   }
   steps {
      shell('ssh tstusr@h007 /tools/CS/bin/gcs-ci-cd ${CLUSTER} check /home/tstusr/CS/gcs-ci-cd-0/testsuite/src/checktree/upgrade_test/current_version_upgrade 200')
   }
}
queue('GCS-CI-CD/TestsLong/current_version_upgrade')
