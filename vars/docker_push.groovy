def call(String projectName,String imageTag,String dockerHubUser){
    echo "Pushing Docker Image to Docker Hub"
     withCredentials([usernamePassword(
                    credentialsId: "dockerhub",
                    usernameVariable: "USER",
                    passwordVariable: "PWD"
                )
                ]){
                    sh """
                        docker login -u ${dockerHubUser} -p ${PWD}
                        docker push ${dockerHubUser}/${projectName}:${imageTag}
                    """
                }

}