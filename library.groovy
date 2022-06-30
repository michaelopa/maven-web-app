def call(string stages)
if ("$stages" == "build"){
sh "mvn clean package"
}
else if ("$stages" == "sonar"){
  sh "mvn sonar:sonar"
}
else if ("$stages" == "deploy"){
  sh "mvn deploy" 
}
