1. add the following line to your .bash_profile ```export HYBRIS_OPT_CONFIG_DIR=/path-to-repo/hybris/env/local```
2. Execute the following command: ```ant install -Dhybris.zip.package.src=/path/to/any/SAPHybris.zip```
3. Add the following to your /etc/hosts file: ```127.0.0.1       talos.local```
4. Execute the following command: ```ant customize npminstall clean all```




