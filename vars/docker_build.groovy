def build(String projectName,String imageTag,String dockerHubUser){
    echo "Building Docker Image"
    sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
    echo "Docker Image built successfully."
}