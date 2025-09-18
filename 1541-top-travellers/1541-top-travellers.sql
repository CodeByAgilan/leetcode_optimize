select U.name as name,
    sum(NVL(r.distance,0)) as travelled_distance
from Users U
left join Rides r
  on U.id=r.user_id
group by U.id,u.name
order by travelled_distance desc,u.name ;

-- SELECT
--   u.name,
--   SUM(NVL(r.distance, 0)) AS travelled_distance
-- FROM Users u
-- LEFT JOIN Rides r
--   ON u.id = r.user_id
-- GROUP BY u.id, u.name
-- ORDER BY travelled_distance DESC, u.name ASC;





