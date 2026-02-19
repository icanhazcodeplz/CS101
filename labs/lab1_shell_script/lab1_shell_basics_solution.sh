#!/bin/bash

# 1. Print your current directory to console (done for you as an example)
pwd

# 2. Print the text "This is a console" to the terminal
echo "This is a console"
# 3. Create a new directory called 'test_folder'
mkdir test_folder
# 4. Navigate into 'test_folder'
cd test_folder
# 5. Create empty files named 'file1.txt', 'file2.txt', and '.hidden_file.txt'. (notice period in front of 'hidden_file')
touch file1.txt file2.txt .hidden_file.txt
# 6. List the contents of 'test_folder'. Use options to print hidden files.
ls -a
# 7. Run the command `echo " l1\n l2\n l3\n l4\n l5\n l6" > file1.txt`. This saves some text into file1.txt.
echo " l1\n l2\n l3\n l4\n l5\n l6" > file1.txt
# 8. Print the entire contents of 'file1.txt'
cat file1.txt
# 9. Print the first two lines of 'file1.txt'
head -n 2 file1.txt
# 10. Copy file 'file1.txt' to a new file called 'file1_backup.txt'.
cp file1.txt file1_backup.txt
# 11. Create a new directory called 'backups' in 'test_folder'
mkdir backups
# 12. Move 'file1_backup.txt' into 'backups'.
mv file1_backup.txt backups/
# 13. Delete 'file1.txt'
rm file1.txt
# 14. Delete folder 'backups' and all of its contents recursively (should be a single command)
rm -r backups
# 15. Move up one directory (to where you started originally)
cd ..
# 16. Delete 'test_folder' and all of its contents
rm -r test_folder