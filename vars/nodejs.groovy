def call() {
    node {


        common.codeCheckout()
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
