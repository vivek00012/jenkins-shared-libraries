def cloneRepo(String url, String branch = 'master') {
    echo "Cloning the repository from ${url} on branch ${branch}"
    git branch: "${branch}", url: "${url}"
    echo "Repository cloned successfully."
}