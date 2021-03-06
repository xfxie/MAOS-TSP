/**
 * Description: the termination condition checking interface
 *
 * @Author         Create/Modi     Note
 * Xiaofeng Xie    Nov 10, 2006
 * Xiaofeng Xie    Aug 21, 2008    MAOS M01.00.00
 *
 * @version M01.00.00
 * @since M01.00.00
 */

package maosKernel.behavior.terminate;

import maosKernel.memory.*;

public interface ITerminateCycleCheckEngine {
  public boolean isCycleTerminated(int currentNCycle, EncodedState cycleBestState);
}
