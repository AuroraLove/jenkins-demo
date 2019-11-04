pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''tomcat_dir="/opt/tomcat-8083/webapps/doc/"

function getFiles()
{
for file in `ls`
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


newFiles=($(getFiles))

getNewFiles "${newFiles[*]}"

#echo ${existFiles[*]}
'''
      }
    }
  }
}