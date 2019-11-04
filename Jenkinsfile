pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''cd /usr/local
chmod u+x apidoc.sh
./apidoc.sh'''
      }
    }
  }
}