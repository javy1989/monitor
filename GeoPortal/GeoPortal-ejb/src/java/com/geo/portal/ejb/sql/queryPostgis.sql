SELECT id,nombre,codigo,ST_X(geometria) as x, ST_Y(geometria) as y, ST_AsText(geometria) 
       FROM parada;


create view vista_parada as SELECT id,nombre,codigo,ST_X(geometria) as x, ST_Y(geometria) as y, ST_AsText(geometria) as texto
       FROM parada;

SELECT ST_GeomFromText(geometria)
       FROM via;

create view vista_via as 
SELECT id,nombre,codigo,ST_AsEWKT(geometria) as texto from via;

INSERT INTO app(p_id, the_geom)
 VALUES(2, ST_GeomFromText('POINT(-71.060316 48.432044)', 4326));