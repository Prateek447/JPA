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
