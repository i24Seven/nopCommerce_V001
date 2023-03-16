pipeline{
agent any
    stages{
    stage ("Build")
        {
        steps{
        echo "Bulding the Project...."
        echo "This is BUILD Stage..."
            bat "mvn clean"
        }
    }
    stage("Test")
    {
        steps{
        echo "Testing the Project........"
            bat "mvn test"
        }
    }
    stage("Deploye")
      {
      steps{
      echo "Deploying the Project........"
          bat "mvn compile"
      }
    }
}
}
