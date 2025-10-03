SELECT 
    CASE 
        WHEN S.id % 2 = 1 AND S.id - 1 = N.id THEN N.id
        WHEN S.id % 2 = 0 AND S.id + 1 = P.id THEN P.id
        ELSE S.id
    END AS id,
    CASE 
        WHEN S.id % 2 = 1 AND S.id + 1 = N.id THEN N.student
        WHEN S.id % 2 = 0 AND S.id - 1 = P.id THEN P.student
        ELSE S.student
    END AS student
FROM Seat S
LEFT JOIN Seat N ON S.id + 1 = N.id
LEFT JOIN Seat P ON S.id - 1 = P.id
ORDER BY S.id;
