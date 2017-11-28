package com.jetprobe.sample

import com.jetprobe.core.TestScenario
import com.jetprobe.core.action.SSHConfig
import com.jetprobe.core.annotation.TestSuite
import com.jetprobe.core.structure.ExecutableScenario

/**
  * @author Shad.
  */

@TestSuite
class ShellTestSuite extends TestScenario {

  val sshConfig = SSHConfig(user = "shad", password = "admin", hostName = "xx.xx.xx.xx")

  override def buildScenario: ExecutableScenario =
    scenario("shell testing")
      .ssh(sshConfig, cmd = "cd /home/me/apps && ls -lrt")
      .build


}
