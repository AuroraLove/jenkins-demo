pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''#!/usr/bin/env bash
tomcat_dir="/opt/tomcat-8083/webapps/doc/"

function getFiles()
{
for file in `ls $1`
do
 echo $file
 arr=(${arr[*]} $file)
done
echo  ${arr[*]}
}


function getNewFiles()
{
   arr=$1
   for newFile in ${arr[*]}
   do
     local newFilePath=$tomcat_dir$newFile
     if [ ! -d "$newFilePath" ]; then
       mkdir -p $newFilePath
     fi


   done
}


newFiles=($(getFiles $pwd/src))

getNewFiles "${newFiles[*]}"

#echo ${existFiles[*]}
'''
      }
    }
  }
}