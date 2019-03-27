# LISTING 2.7 ShowCurrentTime.py

import time

currentTime = time.time()  # 1553690523.3614953
totalSeconds = int(currentTime)
currentSeconds = totalSeconds % 60
totalMinutes = totalSeconds // 60
currentMinutes = totalMinutes % 60
totalHours = totalMinutes // 60
currentHours = totalHours % 24
print("Current time is", currentHours, ":", currentMinutes, ":", currentSeconds)
