<template>
  
<div>
  <div class='subject'>DailyUI #003 <strong>Landing Page</strong></div>

  <div class='screen'>

    <div class='page'>
      <section class='hero'>
        <div class='cta'><span>반려동물과 나의 이야기<br> </span>PET & ME</div>
        <button class='button-cta' @click="login">START</button>
      </section>
      <section class='features'>
        <div class='section-name' id='sec-features'>FEATURES</div>
        <div class='section-title'>15 steps to consider</div>
        <div class='section-subtitle'><a
            href='https://medium.com/@christianreber/15-steps-to-launch-your-own-startup-74e945869ca4#.vn1j6yaa5'
            target='_blank'>Based on the article '15 steps to launch your own startup' by Christian Reber</a></div>
        <div class='features-container'>
          <div class='features-item'>
            <div class='item-number'>01</div>
            <div class='item-text'>Dream big and start small</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>02</div>
            <div class='item-text'>Work to learn, not to earn</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>03</div>
            <div class='item-text'>Join the community</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>04</div>
            <div class='item-text'>Find the right location</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>05</div>
            <div class='item-text'>Identify good and bad ideas, early</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>06</div>
            <div class='item-text'>Understand trends & markets</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>07</div>
            <div class='item-text'>Define your mission</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>08</div>
            <div class='item-text'>Prepare to fail, 95% do</div>
          </div>
          <div class='features-item'>
            <div class='item-number'>09</div>
            <div class='item-text'>Find the right co-founders</div>
          </div>
          
        </div>
      </section>
      <section class='coments'>
        <div class='section-name' id='sec-coments'>COMENTS</div>
        <div class='hcarousel'>
          <ul class='hpanes'>
            <li>
              <div class='box-clients'>
                <p class='speech'><span></span>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
                  tempor incididunt ut labore et dolore magna aliqua.</p>
                <div class='id-client'>John DoeFoo Startup</div>
              </div>
            </li>
            <li>
              <div class='box-clients'>
                <p class='speech'><span></span>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
                  tempor incididunt ut labore et dolore magna aliqua.</p>
                <div class='id-client'>John DoeFoo Startup</div>
              </div>
            </li>
            <li>
              <div class='box-clients'>
                <p class='speech'><span></span>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
                  tempor incididunt ut labore et dolore magna aliqua.</p>
                <div class='id-client'>John DoeFoo Startup</div>
              </div>
            </li>
          </ul>
        </div>
      </section>
      <section class='second-cta'>
        <div class='section-name' id='sec-contact'></div>
        <div class='section-title negative'>Let's get started</div>
        <button class='button-sec-cta' @click="login">GO!</button>
      </section>
      <section class='footer'>
        <div class='copy'>&copy;2016. All rights reserved.</div>
      </section>
    </div>
</div>

<div class='icon-credits'>Icons made by <a href="http://www.freepik.com" title="Freepik">Freepik</a> from <a href="http://www.flaticon.com" title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
</div>
</template>

<script>
import $ from 'jquery'

export default {
  methods: {
    signup() {
      this.$router.push({name:'Signup'})
    },
    login() {
      this.$router.push({name:'Login'})
    },
    newsfeed() {
      this.$router.push({name:'NewsFeed'})
    },
    logout() {
      this.logoutRemoveToekn()
      this.$router.push({name:'Landing'})
    }
  },
  mounted() {
    $(document).ready( function() {
    $('.page').scroll( function (){
      if ($(this).scrollTop() > 340) {
        $('.button-nav-cta').css("display","block");
        $(".button-nav-cta").removeClass("anim_fadeInLeft");
        $(".button-nav-cta").addClass("anim_fadeInRight");
      } else {
        $('.button-nav-cta').css("display","none");
        $(".button-nav-cta").removeClass("anim_fadeInLeft");
        $(".button-nav-cta").addClass("anim_slideInLeft");
      }
    });
    
    $('#scrollup').on('click', function () {
      $('.page').animate({ scrollTop: 0 }, 800);
    });
    
    // $('.page').animate({ scrollTop: 2200 }, 0).animate({ scrollTop: 0 }, 4000);
  });

    const footerEl = document.querySelector('#footer-container')
    footerEl.classList.add('inactive')
    const inputEl = document.querySelector('.my-search-bar')
    inputEl.classList.add('inactive')
  }
}
</script>

<style lang="scss" scoped>
.landing-container {
  position: relative;
  top:100px;
  z-index: 3;
}
// .home {
//   width: 100%;
//   height: 130vh;
//   background-image: url('../../assets/background.jpg');
//   background-position: center top;
//   background-size: cover;
// }

.myH2 {
  text-align: center;
  font-size: 4rem;
}

.myP {
  text-align: justify;
  padding-left: 15%;
  padding-right: 15%;
  font-size: 20px; 
  background-color: #fff;
}
@media all and (max-width:700px) {
  .myP {
    padding: 2%;
  }
}
/*--------------------
General Style
---------------------*/
*,
*::before,
*::after {
  box-sizing: border-box;
}

  .screen::-webkit-scrollbar {
    display: none;
  }
body,
html {
  height: 100%;
  font-family:'Open Sans', 'Helvetica Neue', Helvetica, sans-serif;
  font-weight: 400;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

body {
  background-color: #aacfd0;
}

.subject {
  font-family: 'Playfair Display', serif;
  color: rgba(255,255,255,0.07);
  font-size: 180px;
  font-size: 16vw;
  letter-spacing: -4px;
  line-height: 0.9;
  z-index: -1;
}

/*--------------------
Screen
---------------------*/

.screen {
  width: 1200px;
  height: 100%;
    scrollbar-width: none;
  position: absolute;
  top: 50%;
  left: 50%;
  background: #272625;
  overflow: hidden;
  
  -webkit-transform: translate(-50%, -50%);
          transform: translate(-50%, -50%);
  
  -webkit-box-shadow: 30px 30px 48px rgba(31,78,95,0.4);
     -moz-box-shadow: 30px 30px 48px rgba(31,78,95,0.4);
          box-shadow: 30px 30px 48px rgba(31,78,95,0.4);
}

/*--------------------
Navigation
---------------------*/

.nav {
  width: 100%;
  height: 66px;
  position: fixed;
  top: -1px;
  padding: 15px 25px;
  z-index: 9999;
  
  -webkit-transition: all 0.3s;
     -moz-transition: all 0.3s;
      -ms-transition: all 0.3s;
       -o-transition: all 0.3s;
          transition: all 0.3s;
}

.nav > nav {
  float: right;
}

button {
  border: none;
  text-decoration: none;
}

button:focus { 
  outline:0;
}

.button-nav {
  height: 50px;
  padding: 0px 16px;
  font-family:'Open Sans', 'Helvetica Neue', Helvetica, sans-serif;
  font-size: 16px;
  line-height: 38px;
  text-align: center;
  position: relative;
	float: left;
	background-color: transparent;
  border-bottom: 5px transparent solid;
	color: rgba(0,0,0,0.6);
  
  -webkit-transition: all 0.3s;
     -moz-transition: all 0.3s;
      -ms-transition: all 0.3s;
       -o-transition: all 0.3s;
          transition: all 0.3s;
}

.button-nav:hover { 
	cursor: pointer;
  height: 40px;
  color: #000;
	border-bottom: 5px #000 solid;
}

/*--------------------
Page
---------------------*/

.page {
  width: 100%;
  height: 100%;
  overflow-y: auto;
  overflow-wrap: normal;
}
.page::-webkit-scrollbar{
  display: none;
}
.section-name {
  font-size: 12px;
  letter-spacing: 1px;
  color: rgba(255,255,255,0.2);
}

.section-title {
  font-size: 36px;
  letter-spacing: -2px;
  color: #f3bf02;
  text-align: center;
  margin-bottom: 4px;
}

.section-subtitle {
  text-align: center;
}

.section-subtitle a {
  height: 26px;
  font-size: 13px;
  font-style: italic;
  letter-spacing: 0px;
  text-align: center;
  text-decoration: none;
  cursor: pointer;
  color: rgba(243,191,2,0.5);
  padding: 2px 8px;
  border: 1px solid rgba(243,191,2,0.5);
  
  -webkit-border-radius: 13px;
     -moz-border-radius: 13px;
          border-radius: 13px;
}

.negative {
  color: #000;  
}

/*--------------------
Hero
---------------------*/

section.hero {
  position: relative;
  height: 485px;
  padding: 60px;
  background: url('https://static.pexels.com/photos/9477/pexels-photo-large.jpeg');
  background-repeat: no-repeat;
  background-position: bottom center;
  background-size: 100% auto;
}

/*--------------------
Call To Actions
---------------------*/

.cta {
  height: 170px;
  width: 550px;
  border: 12px solid #000;
  margin-top: 80px;
  padding: 20px;
  font-weight: 800;
	letter-spacing: -3px;
  font-size: 60px;
  text-align: center;
  color: #000;
  line-height: 0.8;
  
  -webkit-box-shadow: 0px 7px 12px rgba(0,0,0,0.4);
     -moz-box-shadow: 0px 7px 12px rgba(0,0,0,0.4);
          box-shadow: 0px 7px 12px rgba(0,0,0,0.4);
}

.cta > span {
  font-size: 48px;
  font-weight: 600;
}

.button-cta, .button-nav-cta, .button-sec-cta {
  padding: 2px 23px;
  font-family:'Open Sans', 'Helvetica Neue', Helvetica, sans-serif;
  color: #272625;
  
  -webkit-border-radius: 23px;
     -moz-border-radius: 23px;
          border-radius: 23px;
  
  -webkit-transition: all 0.3s;
     -moz-transition: all 0.3s;
      -ms-transition: all 0.3s;
       -o-transition: all 0.3s;
          transition: all 0.3s;
}

.button-cta {
  height: 46px;
  position: absolute;
  float: left;
  left: 270px;
  bottom: 150px;
  background-color: #f3bf02;
  border: 3px solid #272625;
  font-weight: 600;
  font-size: 24px;
  letter-spacing: -1px;
  z-index: 1;
}

.button-cta:hover, .button-nav-cta:hover, .button-sec-cta:hover {
  background-color: #272625;
  color: #f3bf02;
  cursor: pointer;
  
  -webkit-box-shadow: 0px 7px 12px rgba(0,0,0,0.4);
     -moz-box-shadow: 0px 7px 12px rgba(0,0,0,0.4);
          box-shadow: 0px 7px 12px rgba(0,0,0,0.4);
}

.button-cta:hover {
  border: 3px solid #f3bf02;
}

.button-nav-cta {
  margin: 1px;
  height: 40px;
  background-color: transparent;
  border: 2px solid #272625;
  font-weight: 600;
  font-size: 16px;
  display: none;
  
  -webkit-transition: all 0.3s;
     -moz-transition: all 0.3s;
      -ms-transition: all 0.3s;
       -o-transition: all 0.3s;
          transition: all 0.3s;
}

section.second-cta {
  padding: 60px;
  background-color: rgba(243,191,2,1);
  text-align: center;
}

.button-sec-cta {
  height: 46px;
  background-color: #f3bf02;
  border: 3px solid #272625;
  font-weight: 600;
  font-size: 24px;
  letter-spacing: -1px;
}

.button-sec-cta:hover {
  color: f3bf02;
}

/*--------------------
Features
---------------------*/

section.features {
  padding: 25px;
}

section.features .features-container {
  padding: 35px 0px;
}

section.features .features-item {
  width: 31.75%;
  height: 200px;
  margin: 0.5% 0.5%;
  border: 3px solid transparent;
  display: inline-table;
  position: relative;
	overflow: hidden;
  
  -webkit-transition: all 0.6s ease-in-out;
     -moz-transition: all 0.6s ease-in-out;
      -ms-transition: all 0.6s ease-in-out;
       -o-transition: all 0.6s ease-in-out;
          transition: all 0.6s ease-in-out;
}

section.features .features-item:hover {
  border: 3px solid #f3bf02;
  -webkit-box-shadow: 14px 14px 24px rgba(0,0,0,0.4);
     -moz-box-shadow: 14px 14px 24px rgba(0,0,0,0.4);
          box-shadow: 14px 14px 24px rgba(0,0,0,0.4);
}

section.features .features-item .item-number {
  width: 100%;
  height: 100%;
  position: absolute;
  top: -40px;
  left: 0px;
  font-size: 200px;
  font-weight: 300;
  letter-spacing: -6px;
  color: #181818;
  text-align: center;
  z-index: 0;
  
  -webkit-transition: all 0.6s ease-in-out;
     -moz-transition: all 0.6s ease-in-out;
      -ms-transition: all 0.6s ease-in-out;
       -o-transition: all 0.6s ease-in-out;
          transition: all 0.6s ease-in-out;
}

section.features .features-item:hover .item-number {
  color: #f3bf02;
}

section.features .features-item .item-text {
  width: 100%;
  padding: 5px;
  position: absolute;
  float: left;
  top: 50%;
  left: 0px;
  font-size: 22px;
  letter-spacing: -1px;
  line-height: 1;
  color: #5e5e5f;
  text-align: center;
  background: rgba(39,38,37,0.8);
  z-index: 1;
  
  -webkit-transform: translate(0%, -50%);
          transform: translate(0%, -50%);
}

section.features .features-item:hover .item-text {
  color: #5e5e5f;
  background: rgba(39,38,37,1);
}

/*--------------------
Coments
---------------------*/

section.coments {
  padding: 35px 25px;
  background-color: #181818;
}

/*--------------------
Speech
---------------------*/

.box-clients {
 	width: 320px;
 	height: 280px;
  margin: auto;
	position: relative;
}

p.speech {
	position: relative;
	width: 300px;
	height: 150px;
	text-align: left;
	line-height: 1.0;
	color: #b0b7c6;
	background-color: #dddfe6;
	padding: 30px 20px 30px 70px;
	margin: auto;
	
	-webkit-border-radius: 6px;
	   -moz-border-radius: 6px;
	        border-radius: 6px;
	
	-webkit-box-shadow: 3px 3px 9px rgba(0,0,0,0.05);
     -moz-box-shadow: 3px 3px 9px rgba(0,0,0,0.05);
          box-shadow: 3px 3px 9px rgba(0,0,0,0.05);
}

p.speech span {
	position: absolute;
	width: 32px;
	height: 32px;
	left: 20px;
	top: 20px;
	background-image: url(data:image/svg+xml;utf8;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iaXNvLTg4NTktMSI/Pgo8IS0tIEdlbmVyYXRvcjogQWRvYmUgSWxsdXN0cmF0b3IgMTYuMC4wLCBTVkcgRXhwb3J0IFBsdWctSW4gLiBTVkcgVmVyc2lvbjogNi4wMCBCdWlsZCAwKSAgLS0+CjwhRE9DVFlQRSBzdmcgUFVCTElDICItLy9XM0MvL0RURCBTVkcgMS4xLy9FTiIgImh0dHA6Ly93d3cudzMub3JnL0dyYXBoaWNzL1NWRy8xLjEvRFREL3N2ZzExLmR0ZCI+CjxzdmcgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayIgdmVyc2lvbj0iMS4xIiBpZD0iQ2FwYV8xIiB4PSIwcHgiIHk9IjBweCIgd2lkdGg9IjUxMnB4IiBoZWlnaHQ9IjUxMnB4IiB2aWV3Qm94PSIwIDAgOTUuMzMzIDk1LjMzMiIgc3R5bGU9ImVuYWJsZS1iYWNrZ3JvdW5kOm5ldyAwIDAgOTUuMzMzIDk1LjMzMjsiIHhtbDpzcGFjZT0icHJlc2VydmUiPgo8Zz4KCTxnPgoJCTxwYXRoIGQ9Ik0zMC41MTIsNDMuOTM5Yy0yLjM0OC0wLjY3Ni00LjY5Ni0xLjAxOS02Ljk4LTEuMDE5Yy0zLjUyNywwLTYuNDcsMC44MDYtOC43NTIsMS43OTMgICAgYzIuMi04LjA1NCw3LjQ4NS0yMS45NTEsMTguMDEzLTIzLjUxNmMwLjk3NS0wLjE0NSwxLjc3NC0wLjg1LDIuMDQtMS43OTlsMi4zMDEtOC4yM2MwLjE5NC0wLjY5NiwwLjA3OS0xLjQ0MS0wLjMxOC0yLjA0NSAgICBzLTEuMDM1LTEuMDA3LTEuNzUtMS4xMDVjLTAuNzc3LTAuMTA2LTEuNTY5LTAuMTYtMi4zNTQtMC4xNmMtMTIuNjM3LDAtMjUuMTUyLDEzLjE5LTMwLjQzMywzMi4wNzYgICAgYy0zLjEsMTEuMDgtNC4wMDksMjcuNzM4LDMuNjI3LDM4LjIyM2M0LjI3Myw1Ljg2NywxMC41MDcsOSwxOC41MjksOS4zMTNjMC4wMzMsMC4wMDEsMC4wNjUsMC4wMDIsMC4wOTgsMC4wMDIgICAgYzkuODk4LDAsMTguNjc1LTYuNjY2LDIxLjM0NS0xNi4yMDljMS41OTUtNS43MDUsMC44NzQtMTEuNjg4LTIuMDMyLTE2Ljg1MUM0MC45NzEsNDkuMzA3LDM2LjIzNiw0NS41ODYsMzAuNTEyLDQzLjkzOXoiIGZpbGw9IiMwMDAwMDAiLz4KCQk8cGF0aCBkPSJNOTIuNDcxLDU0LjQxM2MtMi44NzUtNS4xMDYtNy42MS04LjgyNy0xMy4zMzQtMTAuNDc0Yy0yLjM0OC0wLjY3Ni00LjY5Ni0xLjAxOS02Ljk3OS0xLjAxOSAgICBjLTMuNTI3LDAtNi40NzEsMC44MDYtOC43NTMsMS43OTNjMi4yLTguMDU0LDcuNDg1LTIxLjk1MSwxOC4wMTQtMjMuNTE2YzAuOTc1LTAuMTQ1LDEuNzczLTAuODUsMi4wNC0xLjc5OWwyLjMwMS04LjIzICAgIGMwLjE5NC0wLjY5NiwwLjA3OS0xLjQ0MS0wLjMxOC0yLjA0NWMtMC4zOTYtMC42MDQtMS4wMzQtMS4wMDctMS43NS0xLjEwNWMtMC43NzYtMC4xMDYtMS41NjgtMC4xNi0yLjM1NC0wLjE2ICAgIGMtMTIuNjM3LDAtMjUuMTUyLDEzLjE5LTMwLjQzNCwzMi4wNzZjLTMuMDk5LDExLjA4LTQuMDA4LDI3LjczOCwzLjYyOSwzOC4yMjVjNC4yNzIsNS44NjYsMTAuNTA3LDksMTguNTI4LDkuMzEyICAgIGMwLjAzMywwLjAwMSwwLjA2NSwwLjAwMiwwLjA5OSwwLjAwMmM5Ljg5NywwLDE4LjY3NS02LjY2NiwyMS4zNDUtMTYuMjA5Qzk2LjA5OCw2NS41NTksOTUuMzc2LDU5LjU3NSw5Mi40NzEsNTQuNDEzeiIgZmlsbD0iIzAwMDAwMCIvPgoJPC9nPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+CjxnPgo8L2c+Cjwvc3ZnPgo=);
	background-repeat: no-repeat;
  background-position: center center;
  background-size: 32px;
}

p.speech:before {
	content: ' ';
	position: absolute;
	width: 0;
	height: 0;
	left: 30px;
	top: 150px;
	border: 15px solid;
	border-color: #dddfe6 transparent transparent #dddfe6;
}

p.speech:after {
	content: ' ';
	position: absolute;
	width: 0;
	height: 0;
	left: 38px;
	top: 150px;
	border: 5px solid;
	border-color: #dddfe6 transparent transparent #dddfe6;
}

.id-client {
  position: absolute;
  float: left;
  top: 200px;
	color: #5e5e5f;
}

/*--------------------
Carousel
---------------------*/

.hcarousel { /* Carousel Horizontal */
  overflow: hidden;
  width: 100%;
}

.hpanes {
  list-style: none;
  position: relative;
  width: 300%; /* Number of panels * 100% */
  margin-top: 20px;
  overflow: hidden;
        
  -webkit-animation: hcarousel 30s infinite;
     -moz-animation: hcarousel 30s infinite;
          animation: hcarousel 30s infinite;
}

.hpanes > li {
  position: relative;
  float: left;
  width: 33%; /* 100% split by number of panels */
}

@keyframes hcarousel {
    0%    { left:0; }
    11%   { left:0; }
    12.5% { left:0; }
    23.5% { left:0; }
    25%   { left:-100%; }
    36%   { left:-100%; }
    37.5% { left:-100%; }
    48.5% { left:-100%; }
    50%   { left:-200%; }
    61%   { left:-200%; }
    62.5% { left:-200%; }
    73.5% { left:-200%; }
    75%   { left:-100%; }
    86%   { left:-100%; }
    87.5% { left:-100%; }
    98.5% { left:-100%; }
    100%  { left:0; }
}
  
/*--------------------
Footer
---------------------*/

section.footer {
  padding: 40px 25px;
  background-color: #181818;
  text-align: center;
}

.copy {
  font-size: 15px;
  text-align: center;
  color: rgba(243,191,2,1);
}

#scrollup {
  margin: 10px;
  cursor: pointer;
}

/*--------------------
CTA Animations
---------------------*/

.anim_fadeInLeft {
	animation: fadeInLeft 0.3s linear;
  -moz-animation: fadeInLeft 0.3s linear;
  -webkit-animation: fadeInLeft 0.3s linear;
  -o-animation: fadeInLeft 0.3s linear;
}

.anim_fadeInRight {
	animation: fadeInRight 0.3s linear;
  -moz-animation: fadeInRight 0.3s linear;
  -webkit-animation: fadeInRight 0.3s linear;
  -o-animation: fadeInRight 0.3s linear;
}

/*--------------------
Credits & Other
---------------------*/

.icon-credits {
  width: 100%;
  position: absolute;
  bottom: 4px;
  font-family:'Open Sans', 'Helvetica Neue', Helvetica, sans-serif;
  font-size: 12px;
  color: rgba(0,0,0,0.08);
  text-align: center;
  z-index: -1;
}

.icon-credits a {
  text-decoration: none;
  color: rgba(0,0,0,0.12);
}

</style>