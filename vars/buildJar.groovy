#!/usr/bin/env groovy
//the above is used to tell the system you are using groovy

def call(){
    echo "building the application..."
    sh 'mvn package'
}