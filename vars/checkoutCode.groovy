def call(String repoUrl, String branch, String credentialsId) {
    checkout([
        $class: 'GitSCM', 
        branches: [[name: "*/${branch}"]],  // Checkout the specified branch
        doGenerateSubmoduleConfigurations: false,
        extensions: [], 
        submoduleCfg: [], 
        userRemoteConfigs: [[
            url: repoUrl,  // GitHub repo URL passed as a parameter
            credentialsId: credentialsId  // Credentials ID passed as a parameter
        ]]
    ])
}

