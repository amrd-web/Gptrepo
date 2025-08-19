# Java WebApp CI/CD with Jenkins + Ant + Tomcat

This project builds and deploys a Java web application (Servlet + JSP) using Jenkins pipeline, Ant, and Tomcat.

## Setup

- Jenkins with Ant, Git plugins installed.
- Tomcat server running, credentials added in Jenkins (`tomcat-creds`).
- Update Git URL and Tomcat URL in Jenkinsfile.

## Commands

- `ant clean war` — build the WAR file.
- Jenkins pipeline automates build and deployment.

## Access

Open in browser: `http://your-tomcat-server:8080/MyWebApp`
