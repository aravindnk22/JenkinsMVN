pipeline {
  agent any
  stages {
    stage('Cleaning Stage') {
      steps {
        bat 'mvn clean'
      }
    }
    stage('Testing Stage') {
      steps {
        bat 'mvn clean'
      }
    }
    stage('Packaging Stage') {
      steps {
        bat 'mvn package'
      }
    }
    stage('Email Stage') {
      steps {
        mail bcc: '',
        body: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:',
        cc: 'aravindnk22@gmail.com',
        from: 'aravindnk22@rediffmail.com',
        replyTo: '',
        subject: 'Jenkins Declarative pipeline: $PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!',
        to: 'aravindnk22@rediffmail.com'
      }
    }
  }
}