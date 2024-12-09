insert into customers(
    name,
    surname,
    age,
    phone_number
) values
      ('Alex', 'Ivanov', 25, 111111),
      ('Georgi', 'Chernov', 51, 222222),
      ('Vlad', 'Orlov', 65, 333333),
      ('Maxim', 'Ovchinnikov', 28, 444444);

insert into orders(
    product_name,
    customer_id,
    amount
) values
      ('mouse', 1, 2),
      ('keyboard', 2, 1),
      ('notebook', 1, 1),
      ('printer', 3, 1),
      ('mouse', 4, 2),
      ('monitor', 2, 1),
      ('notebook', 4, 1);