# DataWedge Intent Example 2
This application shows the basic principles of how to control DataWedge via the [DataWedge Intent API](http://techdocs.zebra.com/datawedge/6-6/guide/api/).  

![Application Screenshot](https://raw.githubusercontent.com/darryncampbell/DataWedge-Intent-Example-2/master/screenshots/application.png?raw=true)

* Build application
* Install application on Zebra device
* Observe that the scanner can be controlled with the buttons on the UI.  Scanned data is inserted into the text area
* **If the UI buttons do not work or scanned data does not appear in the text area, see troubleshooting below**

##  Troubleshooting:
### DataWedge Version
This application will only work on Zebra Android mobile devices running DataWedge 6.3 or higher.  To check your datawedge version, launch the DataWedge application then go to the menu (3 dots), then 'about':

![Determining DataWedge version 1](https://raw.githubusercontent.com/darryncampbell/DataWedge-Intent-Example-2/master/images/dw_version_1.png?raw=true)
![Determining DataWedge version 2](https://raw.githubusercontent.com/darryncampbell/DataWedge-Intent-Example-2/master/images/dw_version_2.png?raw=true)

It is possible to use a version of the DataWedge APIs that work on 6.0 or higher, for the sake of simplicity I have used the more recent 6.3+ APIs in this example but you can see the 6.0+ APIs in my [more fully featured project](https://github.com/darryncampbell/DataWedge-API-Exerciser).

### Vysor or other keyboard applications
This application depends on DataWedge sending keyboard output to the application after a successful scan.  Vysor has been known to interrupt this workflow, it is recommended to uninstall Vysor or ensure a non-Vysor keyboard is selected (you may need to select the Vysor keyboard and then re-select the Google keyboard):

![Vysor Keyboard 1](https://raw.githubusercontent.com/darryncampbell/DataWedge-Intent-Example-2/master/images/vysor_1.png?raw=true)
![Vysor Keyboard 2](https://raw.githubusercontent.com/darryncampbell/DataWedge-Intent-Example-2/master/images/vysor_2.png?raw=true)


### DataWedge configuration
Unless you have changed any of the DataWedge configuration on the device, this application will use the default profile (Profile 0) with:
* Barcode input Enabled with common decoders
* Keystroke output Enabled

If you have changed any of these settings then you may find the application does not work e.g. disabling keystroke output or disabling the default profile.

There are multiple ways to resolve this including:
* You can restore DataWedge back to its default settings from the DataWedge application --> Menu (3 dots) --> Settings --> Restore 
* You can create a new profile and associate it with this application

