import numpy as np
import matplotlip.pyplot as plt

h=np.arange(0.01, 0.99, 0.01)
plt.plot(h,-(h*np.log2(h)+(1-h)*np.log2(1-h)))
plt.ylabel('H^x')
plt.xlabel('h')
plt.show()