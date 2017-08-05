This page is for installing jenkins on centos 7
* Installing Java : sudo yum -y install java
* sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat/jenkins.repo
* sudo rpm --import https://jenkins-ci.org/redhat/jenkins-ci.org.key
* sudo yum install jenkins
* sudo systemctl start jenkins.service
* sudo systemctl status jenkins.service
* java -jar jenkins.war --httpPort=8083
once it has shown Jenkins is up and ready
go to browser [localhost:8083]

Reference :
https://www.digitalocean.com/community/tutorials/how-to-set-up-jenkins-for-continuous-development-integration-on-centos-7
