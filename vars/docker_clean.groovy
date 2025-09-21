def cleanup(String projectName,String imageTag,String dockerHubUser ){
    echo "Removing old images"
    sh "docker rmi -f ${dockerHubUser}/${projectName}:${imageTag} || true"
    echo "Cleanup completed."
}