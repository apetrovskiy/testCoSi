!function(){"use strict";function s(n){return/^\d+$/.test(n)}var n=function(n,t){for(var a=0,i=n;a<i.length;a++){var r=i[a];if(parseInt(r,10)%100<t)return!0}return!1}(function(n){var t={},a=[];if(n._bizo_data_partner_id&&(t[n._bizo_data_partner_id]=!0,a.push(n._bizo_data_partner_id)),n._bizo_data_partner_ids)for(var i=0,r=n._bizo_data_partner_ids;i<r.length;i++){!t[d=r[i]]&&s(d)&&(t[d]=!0,a.push(d))}if(n._linkedin_data_partner_id&&!t[n._linkedin_data_partner_id]&&(t[n._linkedin_data_partner_id]=!0,a.push(n._linkedin_data_partner_id)),n._linkedin_data_partner_ids)for(var e=0,_=n._linkedin_data_partner_ids;e<_.length;e++){var d;!t[d=_[e]]&&s(d)&&(t[d]=!0,a.push(d))}return a}(window),75)?"https://snap.licdn.com/li.lms-analytics/insight.beta.min.js":"https://snap.licdn.com/li.lms-analytics/insight.old.min.js",t=document.createElement("script"),a=document.getElementsByTagName("script")[0];t.async=!0,t.src=n,a.parentNode&&a.parentNode.insertBefore(t,a)}();
