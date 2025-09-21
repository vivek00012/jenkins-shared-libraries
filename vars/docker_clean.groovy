def cleanup(String image){
    echo "Removing old images"
    sh "docker rmi -f ${image} || true"
    echo "Cleanup completed."
}