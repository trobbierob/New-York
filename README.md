# New York
Sixth Project for Udacity's Android Basics Program

## Description

New York is a Tour Guide app. This is an app with multiple screens, each of which lists a kind of attraction for New York.  

## Prerequisites

* Android SDK v24

## Screenshots

![](https://github.com/trobbierob/New-York/blob/master/screenshots/screenshot1.png)<br />
![](https://github.com/trobbierob/New-York/blob/master/screenshots/screenshot2.png)<br />
![](https://github.com/trobbierob/New-York/blob/master/screenshots/screenshot3.png)

## Specifications

* App contains at least 4 lists of relevant attractions for a location
  * Each list item contains information about an event, restaurant, historical site, or similar.
  * At least one list includes pictures of the location.
* User can navigate between lists using a central screen, a NavDrawer, or a View pager.
* App contains a custom object for storing location information.
* App uses a custom adapter to populate the layout with views based on instances of the custom class.
* All strings are stored in the strings.xml resource file.
* All images are stored as drawables.
  * All drawables are stored at multiple densities.

## Sample Code
~~~
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                int companyBackground;

                switch (position) {
                    case 0:
                        Intent tipsyIntent = new Intent(DessertActivity.this, LocationDetailActivity.class);
                        tipsyIntent.putExtra(getString(R.string.name), getString(R.string.tipsy_name));
                        tipsyIntent.putExtra(getString(R.string.title), getString(R.string.tipsy_title_name));
                        tipsyIntent.putExtra(getString(R.string.number), getString(R.string.tipsy_number));
                        tipsyIntent.putExtra(getString(R.string.address), getString(R.string.tipsy_address));
                        tipsyIntent.putExtra(getString(R.string.about), getString(R.string.tipsy_description));
                        companyBackground = R.drawable.d_tipsy_scoop;
                        tipsyIntent.putExtra(getString(R.string.background), companyBackground);
                        startActivity(tipsyIntent);
                        break;
~~~

## Special Thanks

Chris Banes [Cheesesquare](https://github.com/chrisbanes/cheesesquare)
