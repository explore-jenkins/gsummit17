#!groovy
pipeline {
   agent{ label 'worker_node1'}
   libraries {
       lib('Utilities2')
   }
   stages {
      stage('Source') {
         steps {
            checkout scm
       	    stash name: 'test-sources', includes: 'api/**, dataaccess/**,  util/**, build.gradle, settings.gradle'
         }
      }
      
   }
}

