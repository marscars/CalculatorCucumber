node {
    stage ('Build') {
        checkout scm
        echo "Skipping"
    }

    stage ('JUnit testing') {
        checkout scm
        echo "Skipping"
    }


    stage ('Cucumber testing') {
        checkout scm
        sh 'mvn test'
    }
}