node {
  stage "source check out"
  checkout scm


  stage "build and test"
  try {
      sh "./gradlew build"
    } catch(e) {
      println "build failed " + e
    }
  step([$class:"JUnitResultArchiver",testResults:"**/build/test-results/TEST-*.xml"])
}
