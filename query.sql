SELECT B.id,
	   A.name,
	  B.status as pendidikan_terakhir,
           A.time_create,
           B.time_create as time_update
 FROM murid A
 JOIN pendidikan B ON A.id =B.id_murid
 where B.id = (
  select id from pendidikan where id_murid = A.id ORDER BY id DESC LIMIT 1
 );


