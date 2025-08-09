# Springboot with shedlock demo

---

__@Scheduled(cron = "0 * * * * ?")__
This will run the method once every minute on the 0th second.
@SchedulerLock(name = "myJob_scheduledTask", lockAtLeastFor = "5m", lockAtMostFor = "10m")


 ShedLock library in Spring-based applications to prevent concurrent execution of scheduled tasks — especially important in clustered or distributed environments.

**ockAtLeastFor = "5m"**
Prevents other instances from running the job too soon.

**lockAtMostFor = "10m"**
Acts as a fail-safe. If the instance crashes or hangs, the lock won’t be held forever.

![DB_table](https://github.com/user-attachments/assets/f1f62248-ba2e-4033-8bd7-ab444072d6e3)

![drwarback](https://github.com/user-attachments/assets/dc07592c-1366-4db5-bc47-c36cbeaf1c02)

---
__To Run application__

./gradlew bootRun --args='--server.port=9091'
./gradlew bootRun --args='--server.port=9092'
