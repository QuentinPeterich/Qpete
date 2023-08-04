# def my_function(a, b, c):
#     Do this with a
#     Then do this with b
#     Finally do this with c
#
#
# def greet_with(name, location):
#     print(f'Hello {name}')
#     print(f'What is it like in {location}')
#
#
# greet_with(name="Quentin", location="Orlando")


# Write your code below this line 👇
# def paint_calc(height, width, cover):
#     test_h * test_w / coverage
#     return


# Write your code above this line 👆
# Define a function called paint_calc() so that the code below works.

# 🚨 Don't change the code below 👇
# test_h = int(input("Height of wall: "))
# test_w = int(input("Width of wall: "))
# coverage = 5
# paint_calc(height=test_h, width=test_w, cover=coverage)



import boto3
session = boto3.Session()
s3_client = session.client('s3')
b = s3_client.list_buckets()
for item in b['Buckets']:
    print(item['Name'])