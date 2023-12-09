def call() {
    node {

      if (! env.TAG_NAME) {
          env.TAG_NAME = ""
      }

        common.codeQuality()
        common.codeChecks()
        common.artifacts()








////
//            stage('Prepare Artifact') {
//                steps {
//                    echo 'Prepare Artifact'
//                }
//            }
//
//            stage('Publish Artifact') {
//                steps {
//                    echo 'Publish Artifact'
//                }
//            }
       }
  }
