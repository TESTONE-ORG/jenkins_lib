// vars/deployApp.groovy
def deploy(String appName, String version, String environment) {
    echo "Deploying application ${appName} version ${version} to ${environment}"
    // You can add deployment logic, like pushing Docker images or applying Kubernetes YAML files
    sh "kubectl apply -f ${appName}-${environment}.yaml"
}
