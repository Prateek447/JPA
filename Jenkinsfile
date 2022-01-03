node{
stage('SCM Checkout'){
git branch: 'main', url: 'https://github.com/Prateek447/JPA'
}
stage('compile-package){
sh 'mvn package'
}
}
