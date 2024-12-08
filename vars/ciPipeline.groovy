// vars/ciPipeline.groovy
def buildDockerImage(String imageName, String tag) {
    echo "Building Docker image: ${imageName}:${tag}"
    sh "docker build -t ${imageName}:${tag} ."
}

def runTests() {
    echo "Running unit tests"
    sh './gradlew test'
}

def deployToEnvironment(String environment, String appVersion) {
    echo "Deploying ${appVersion} to ${environment}"
    // Logic to deploy to the selected environment
    sh "kubectl apply -f deploy-${environment}.yaml"
}
