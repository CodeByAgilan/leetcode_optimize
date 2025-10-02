SELECT class
from Courses
GROUP BY class
having count(student)>4;