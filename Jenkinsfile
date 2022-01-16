node{
stage('SCM Checkout'){
git branch: 'main', url: 'https://github.com/Prateek447/JPA'
}
  stage('checking path'){
  def mvnHome = tool 'maven'
    echo "${mvnHome}"
  }
stage('compile-package'){
  def mvnHome = tool 'maven'
  sh "${mvnHome}/bin/mvn clean install"
}
}




node {

       def app
       
        stage('Clonning') {
                  git branch: 'main', url: 'https://github.com/Prateek447/mini-project.git'
        }
          stage('build jar file') {
                powershell 'mvn clean install'
        }
         stage('building docker image') {
                 app = docker.build("yprateek51/mini-project")
        }
         stage('pushing image to docker-hub') {
            docker.withRegistry('https://registry.hub.docker.com', 'docker-id') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
    }
}
