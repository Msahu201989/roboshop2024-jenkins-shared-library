def call() {
    node {

      if (! env.TAG_NAME) {
          env.TAG_NAME = ""
      }
        sh 'env'
        common.codeQuality()


            if ( BRANCH_NAME == "main" || tag ==~ ".*") {
               stage('Style Checks') {
                 echo 'Style Checks'
               }
            }



//            stage('Unit Tests') {
//                steps {
//                    echo 'Unit tests'
//                }
//            }

//            stage('Download Dependencies') {
//                steps {
//                    echo 'Download Dependencies'
//                }
//            }
//
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
