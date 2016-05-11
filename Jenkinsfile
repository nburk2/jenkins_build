node {
  stage "source check out"
  checkout scm


  stage "build and test"
  boolean testPassed = true
  try {
      sh "./gradlew build"
    } catch(e) {
      testPassed = false
      println "build failed " + e
    }

  step([$class:"JUnitResultArchiver",testResults:"**/build/test-results/TEST-*.xml"])

  if(!testPassed) {
      throw new Exception("tests failed")
  }

  stage "archive war"
  step([$class:"ArtifactArchiver",artifacts:"**/build/libs/*.war",fingerprint:true])

}
