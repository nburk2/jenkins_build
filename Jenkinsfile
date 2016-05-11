node {
  stage "source check out"
  checkout scm


  stage "build and test"
  sh "./gradlew build"

  step([$class:"JUnitResultArchiver",testResults:"**/build/test-results/TEST-*.xml"])
}
