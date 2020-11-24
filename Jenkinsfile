pipeline {
  agent any
  stages {
    stage("Parallel Execution") {
      steps {
        parallel(
        a: {
          bat "mvn clean"
        },
        b: {
          bat "mvn test"
        },
        c: {
          bat "mvn package"
        })
      }
    }
    stage("Email Build Status") {
      steps {
        mail
        from: 'aravindnk22@rediffmail.com',
        cc: 'aravindnk22@gmail.com',
        body: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult} \n\nCheck console output at ${env.BUILD_URL} to view the results.",
        subject: "${env.JOB_NAME}  - Build # ${env.BUILD_NUMBER}  - ${currentBuild.currentResult}!!",
        to: 'aravindnk22@rediffmail.com'
      }
    }
  }
}