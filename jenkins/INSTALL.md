This page is for installing jenkins on centos 7
* Installing Java : sudo yum -y install java
* sudo wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat/jenkins.repo
* sudo rpm --import https://jenkins-ci.org/redhat/jenkins-ci.org.key
* sudo yum install jenkins
* sudo systemctl start jenkins.service
* sudo systemctl status jenkins.service
* java -jar jenkins.war --httpPort=8083
* once it has shown Jenkins is up and ready go to browser [localhost:8083]
* use the password on the terminal and log in on the UI and create a user with password thus, next time we can use the username and password.

Reference :
https://www.digitalocean.com/community/tutorials/how-to-set-up-jenkins-for-continuous-development-integration-on-centos-7

* After that go Manage Jenkins and add the required plugins for github.
* Once installation has been done restart the jenkins.
# this is for Maven project
* select new item. Create a new item. select git and give the git repository path [https://github.com/taffazzel/HelloMaven.git]
* poll SCM and give * * * * * for building in every one minute.
* Next go to Build section and click "Add build step", U should be getting a list, from that list select "Invoke top-level Maven targets".
* In the Goal section write test,compile,clean (according to the need)
* In the POM section give the path for the POM.xml under the workspace directory.like [root/.jenkins/workspace/HelloWorld/HelloMaven]
* Setting file -- Use default maven settings
* Global Setting file -- Use default maven global settings
* Apply and exit
* setup JAVA_HOME 
[root@taffazzel-jenkins HelloMaven]# export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.141-1.b16.el7_3.x86_64/jre</br>
[root@taffazzel-jenkins HelloMaven]# export PATH=$JAVA_HOME/bin:$PATH</br>
* instll javac yum install java-devel
* for restart /etc/init.d/jenkins restart

