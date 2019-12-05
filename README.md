# leecode
leecode刷题记录

1.数据库类
https://leetcode-cn.com/problems/delete-duplicate-emails/solution/
DELETE 
FROM
	person 
WHERE
	id NOT IN ( SELECT temp.id FROM ( SELECT min( id ) AS id FROM person GROUP BY email ) temp );
可以查出来要删除的内容，然后使用子查询删除掉。
mysql 不允许同一条sql里 修改和查询同一张表。