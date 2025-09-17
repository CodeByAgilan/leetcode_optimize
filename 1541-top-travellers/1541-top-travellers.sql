# Write your MySQL query statement below
select U.name as name,
    coalesce(sum(r.distance),0) as travelled_distance
from Users U
left join Rides r
  on U.id=r.user_id
group by U.id
order by travelled_distance desc,name  ;