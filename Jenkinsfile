pipeline {
  agent any
  stages {
    stage('Parallel processing') {
      steps {
        parallel {
          a: {
            bat 'mvn clean'
          },
          b: {
            bat 'mvn test'
          },
          c: {
            bat 'mvn package'
          }

        }

      }
    }
    stage('Email Stage') {
      steps {
        mail bcc: '',
        body: '${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${env.BUILD_STATUS}',
        cc: 'aravindnk22@gmail.com',
        from: 'aravindnk22@rediffmail.com',
        replyTo: '',
        subject: 'Jenkins Declarative pipeline: "${env.JOB_NAME}" - Build # "${env.BUILD_NUMBER}" - "${env.BUILD_STATUS}"!',
        to: 'aravindnk22@rediffmail.com'
      }
    }
  }
}