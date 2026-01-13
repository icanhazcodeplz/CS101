#!/bin/bash

# 1. Print the environment variable $HOME
echo $HOME

# 2. Navigate to your $HOME directory
cd $HOME

# 3. Print your current directory to console
pwd

# 4. Create a new directory called 'test_folder'
mkdir test_folder

# 5. Navigate into 'test_folder'
cd test_folder

# 6. Print your current directory to console again
pwd

# 7. Create empty files named 'file1.txt', 'file2.txt', and '.hidden_file.txt'. (notice period in front of 'hidden_file')
touch file1.txt file2.txt .hidden_file.txt

# 8. List the contents of 'test_folder'. Use options to print hidden files.
ls -a

# 9. Use echo and output redirection (either > or >>) to write the text "Hello, World!" into 'file1.txt'.
echo "Hello, World!" > file1.txt

# 10. Append the text "The weather is nice today" as a new line to the end of 'file1.txt'
echo "The weather is nice today" >> file1.txt

# 11. Repeat the previous step 2 times (3 total times)
echo "The weather is nice today" >> file1.txt
echo "The weather is nice today" >> file1.txt

# 12. Print the entire contents of 'file1.txt'
cat file1.txt

# 13. Print the first two lines of 'file1.txt'
head -n 2 file1.txt

# 14. Copy file 'file1.txt' to a new file called 'file1_backup.txt'.
cp file1.txt file1_backup.txt

# 15. List the contents of 'test_folder' with no options
ls

# 16. Create a new directory called 'backups' as a subfolder of 'test_folder'
mkdir backups

# 17. Move 'file1_backup.txt' into 'backups'.
mv file1_backup.txt backups/

# 18. List the contents of 'backups' with no options
ls backups

# 19. List the contents of 'test_folder' with no options
ls

# 20. Remove 'file1.txt'
rm file1.txt

# 21. List the contents of 'test_folder' with no options
ls

# 22. Delete folder 'backups' and all of its contents recursively (should be a single command)
rm -r backups

# 23. List the contents of 'test_folder' with no options
ls

# 24. Create an environment variable called MY_VAR with the value CS101_Student
MY_VAR="CS101_Student"

# 25. Print MY_VAR Environment Variable
echo $MY_VAR

# 26. Move back to the $HOME directory
cd $HOME

# 27. Delete 'test_folder' and all of its contents
rm -r test_folder

# 28. Attempt to navigate into 'test_folder' (should fail)
cd test_folder